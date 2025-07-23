#include <stdio.h>
#include <math.h>

int main() {
    int width = 80;  // terminal width
    int height = 40; // terminal height
    float radius = 1.0;
    float theta, phi;
    float x, y, z;
    float z_buffer[80 * 40] = {0};
    char output[80 * 40] = {' '};

    char shades[] = " .:-=+*#%@"; // From dimmest to brightest

    for (theta = 0; theta < 2 * M_PI; theta += 0.07) {
        for (phi = 0; phi < M_PI; phi += 0.07) {
            // 3D Sphere coordinates
            x = radius * sin(phi) * cos(theta);
            y = radius * sin(phi) * sin(theta);
            z = radius * cos(phi);

            // 2D Projection
            int xp = (int)(width / 2 + x * width / 2);
            int yp = (int)(height / 2 - y * height / 2);

            // Depth buffer check
            int idx = xp + yp * width;
            if (idx >= 0 && idx < width * height) {
                if (z > z_buffer[idx]) {
                    z_buffer[idx] = z;

                    // brightness based on z-axis
                    int shade_index = (int)((z + 1) / 2 * 9); // 0–9
                    output[idx] = shades[shade_index];
                }
            }
        }
    }

    // Print result
    for (int i = 0; i < height; ++i) {
        for (int j = 0; j < width; ++j) {
            putchar(output[j + i * width]);
        }
        putchar('\n');
    }

    return 0;
}

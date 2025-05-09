<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;
use Illuminate\Support\Facades\Hash;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Stagiaire>
 */
class StagiaireFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            'nom' => fake()->firstName(50),
            'prenom' => fake()->lastName(50),
            'email' => fake()->unique()->safeEmail(),
            'age' => fake()->numberBetween(17, 30),
            'password' =>Hash::make('password123'),
        ];
    }
}

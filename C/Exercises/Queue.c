// Queue structure
typedef struct {
    int items[MAX_SIZE];
    int front;
    int rear;
} Queue;

// Initialize queue
void initQueue(Queue *q) {
    q->front = -1;
    q->rear = -1;
}

// Check if queue is empty
bool isQueueEmpty(Queue *q) {
    return q->front == -1;
}

// Check if queue is full
bool isQueueFull(Queue *q) {
    return (q->rear + 1) % MAX_SIZE == q->front;
}

// Enqueue element
void enqueue(Queue *q, int value) {
    if (isQueueFull(q)) {
        printf("Queue is full!\n");
        return;
    }
    
    if (isQueueEmpty(q)) {
        q->front = 0;
    }
    
    q->rear = (q->rear + 1) % MAX_SIZE;
    q->items[q->rear] = value;
}

// Dequeue element
int dequeue(Queue *q) {
    if (isQueueEmpty(q)) {
        printf("Queue is empty!\n");
        return -1;
    }
    
    int value = q->items[q->front];
    
    if (q->front == q->rear) {
        // Last element
        q->front = q->rear = -1;
    } else {
        q->front = (q->front + 1) % MAX_SIZE;
    }
    
    return value;
}

// Peek front element
int peekFront(Queue *q) {
    if (isQueueEmpty(q)) {
        printf("Queue is empty!\n");
        return -1;
    }
    return q->items[q->front];
}

// Display queue elements
void displayQueue(Queue *q) {
    if (isQueueEmpty(q)) {
        printf("Queue is empty!\n");
        return;
    }
    
    printf("Queue (front to rear): ");
    int i = q->front;
    while (true) {
        printf("%d ", q->items[i]);
        if (i == q->rear) break;
        i = (i + 1) % MAX_SIZE;
    }
    printf("\n");
}
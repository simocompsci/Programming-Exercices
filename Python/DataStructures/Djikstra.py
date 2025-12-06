import heapq
import sys

def dijkstra_adjacency_list(graph, start):
    """
    Dijkstra's algorithm using adjacency list representation
    
    Args:
        graph: dict of dicts {node: {neighbor: distance}}
        start: starting node
    
    Returns:
        distances: dict {node: shortest distance from start}
        predecessors: dict {node: previous node in shortest path}
    """
    # Initialize distances with infinity
    distances = {node: float('inf') for node in graph}
    distances[start] = 0
    
    # Priority queue: (distance, node)
    priority_queue = [(0, start)]
    
    # For path reconstruction
    predecessors = {node: None for node in graph}
    
    # Set to track visited nodes
    visited = set()
    
    while priority_queue:
        current_distance, current_node = heapq.heappop(priority_queue)
        
        # Skip if we've already processed this node with a shorter distance
        if current_distance > distances[current_node]:
            continue
        
        visited.add(current_node)
        
        # Explore neighbors
        for neighbor, weight in graph[current_node].items():
            if neighbor in visited:
                continue
                
            new_distance = current_distance + weight
            
            # If found shorter path to neighbor
            if new_distance < distances[neighbor]:
                distances[neighbor] = new_distance
                predecessors[neighbor] = current_node
                heapq.heappush(priority_queue, (new_distance, neighbor))
    
    return distances, predecessors

def reconstruct_path(predecessors, start, end):
    """Reconstruct the shortest path from start to end"""
    path = []
    current = end
    
    while current is not None:
        path.append(current)
        current = predecessors[current]
    
    path.reverse()
    
    # Check if path exists
    if path[0] != start:
        return []
    
    return path

# Example usage
if __name__ == "__main__":
    # Example graph (weighted, directed)
    graph = {
        'A': {'B': 4, 'C': 2},
        'B': {'C': 1, 'D': 5},
        'C': {'B': 1, 'D': 8, 'E': 10},
        'D': {'E': 2, 'F': 6},
        'E': {'F': 2},
        'F': {}
    }
    
    start_node = 'A'
    end_node = 'F'
    
    distances, predecessors = dijkstra_adjacency_list(graph, start_node)
    path = reconstruct_path(predecessors, start_node, end_node)
    
    print("Shortest distances from node", start_node + ":")
    for node, dist in distances.items():
        print(f"  {node}: {dist}")
    
    print(f"\nShortest path from {start_node} to {end_node}:")
    print("  Path:", " -> ".join(path))
    print("  Distance:", distances[end_node])
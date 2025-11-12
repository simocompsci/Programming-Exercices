# Node class represents each element in the linked list
class Node:
    def __init__(self, data):
        self.data = data  # Value stored in the node
        self.next = None  # Pointer to the next node


# LinkedList class to manage the nodes
class LinkedList:
    def __init__(self):
        self.head = None  # Start of the list

    # Insert a new node at the end
    def append(self, data):
        new_node = Node(data)
        if not self.head:  # If the list is empty
            self.head = new_node
            return
        current = self.head
        while current.next:  # Traverse to the last node
            current = current.next
        current.next = new_node

    # Insert at the beginning
    def prepend(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    # Delete a node by value
    def delete(self, key):
        current = self.head

        # If head node itself holds the key
        if current and current.data == key:
            self.head = current.next
            current = None
            return

        # Search for the key to be deleted
        prev = None
        while current and current.data != key:
            prev = current
            current = current.next

        # If key not found
        if current is None:
            return

        # Unlink the node
        prev.next = current.next
        current = None

    # Search for a value in the list
    def search(self, key):
        current = self.head
        while current:
            if current.data == key:
                return True
            current = current.next
        return False

    # Print the linked list
    def display(self):
        elements = []
        current = self.head
        while current:
            elements.append(current.data)
            current = current.next
        print(" -> ".join(map(str, elements)))


# Example usage
if __name__ == "__main__":
    ll = LinkedList()
    ll.append(10)
    ll.append(20)
    ll.append(30)
    ll.prepend(5)
    ll.display()         # Output: 5 -> 10 -> 20 -> 30

    ll.delete(20)
    ll.display()         # Output: 5 -> 10 -> 30

    print(ll.search(10)) # Output: True
    print(ll.search(99)) # Output: False

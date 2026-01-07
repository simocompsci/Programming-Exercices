class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def reverse_linked_list(head):
    prev = None
    current = head

    while current is not None:
        next_node = current.next  # store next
        current.next = prev       # reverse link
        prev = current            # move prev forward
        current = next_node       # move current forward

    return prev  # new head

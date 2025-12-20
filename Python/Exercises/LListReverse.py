class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverse_linked_list(head):
    prev = None
    current = head

    while current:
        next_node = current.next   # save next
        current.next = prev        # reverse pointer
        prev = current             # move prev forward
        current = next_node        # move current forward

    return prev  # new head

# Create list: 1 -> 2 -> 3 -> None
head = ListNode(1, ListNode(2, ListNode(3)))

new_head = reverse_linked_list(head)
# Result: 3 -> 2 -> 1 -> None

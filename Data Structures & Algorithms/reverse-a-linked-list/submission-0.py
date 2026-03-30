from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Trường hợp cơ sở: danh sách rỗng hoặc chỉ có 1 node
        if not head or not head.next:
            return head

        # Gọi đệ quy để đảo ngược phần còn lại
        new_head = self.reverseList(head.next)

        # Đảo chiều liên kết
        head.next.next = head
        head.next = None

        return new_head

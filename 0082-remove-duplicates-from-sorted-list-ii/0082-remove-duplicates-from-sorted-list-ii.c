/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
   struct ListNode dummy;
    dummy.val = 0;
    dummy.next = head;

    struct ListNode* prev = &dummy;
    struct ListNode* temp = head;
    if(head == NULL || head->next == NULL)return head;
    while(temp != NULL && temp->next != NULL){
       if ( temp->next != NULL && temp->val == temp->next->val){
        int t =  temp->val;
        while(temp!=NULL && temp->val == t){
            temp = temp->next;
        }
          prev->next = temp;
       }
       else{
            prev =  temp ;
            temp  = temp->next;
       }
    }
    return dummy.next;
}
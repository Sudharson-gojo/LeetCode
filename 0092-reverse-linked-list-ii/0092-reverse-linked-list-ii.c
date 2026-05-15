/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
  struct ListNode *prev = NULL, *curr = head;
  if(curr==NULL || curr->next == NULL)return head;
  int i =1;
  while(i<left && curr != NULL ){
     prev = curr;
     curr =  curr->next;
     i++;
  }
  struct ListNode* bl  = prev;
  struct ListNode* l = curr;
  struct ListNode* temp = curr;
  while(i<=right && temp != NULL){
     curr = temp->next;
     temp->next = prev;
     prev = temp;
     temp = curr;
     i++;
  }
  if(bl != NULL){
     bl->next =  prev;
  }else{
     head = prev;
  }
  l->next = temp;
  return head;

}

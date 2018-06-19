//https://www.codewars.com/kata/55beec7dd347078289000021

/* Node Definition
struct Node {
  Node * next;
  int data;
}
*/

int Length(Node *head)
{
  if (head == NULL) return 0;
  else
    return 1+Length(head->next);
}

int Count(Node *head, int data)
{
  if (head == NULL) return 0;
  else {
    if(head->data==data)
    return 1+Count(head->next,data);
    else
    return Count(head->next,data);
    }

}
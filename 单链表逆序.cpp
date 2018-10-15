//这段代码用来演示单链表的逆序

#include<stdio.h>

struct Listnode{
	int val;
	Listnode*next;
}a,b,c,d,e;

struct Listnode* reverselist(struct Listnode*);

void putlist(struct Listnode*);

int main()
{
	a.val = 1;
	b.val = 2;
	c.val = 3;
	d.val = 4;
	e.val = 5;
	a.next = &b;
	b.next = &c;
	c.next = &d;
	d.next = &e;
	e.next = NULL;
	struct Listnode*head = &a;
	struct Listnode*New_list = strcut Listnode* reverselist(head);
	putlist(New_list);
}

struct Listnode* reverselist(struct Listnode*header)
{
	struct Listnode*new_node = NULL;
	struct Listnode*temp;
	while(head!=NULL)
	{
		temp = head->next;
		head->next = new_node;
		new_node = head;
		head = temp;
	}
	return new_node;
}

void putlist(struct Listnode*header)
{
	while(new_node)
	{
		printf("%d\n",new_node->val);
		new_node = new_node->next;
	}
}

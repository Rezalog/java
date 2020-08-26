/*===========================
  ���� Ŭ���� ���� ����
  - �������̽�(Interface)
===========================*/

/*
�� ��extends�� vs ��implements��

	Ŭ���� extends Ŭ����
	Ŭ���� extneds �߻�Ŭ����

	�������̽� extends �������̽�
	�������̽� extends �������̽�, �������̽�

	�߻�Ŭ���� implements �������̽�
	�߻�Ŭ���� implements �������̽�, �������̽�

	Ŭ���� implements �������̽�
	Ŭ���� implements �������̽�, �������̽�


��  �������̽��� Ŭ�����ʹ� �޸� ���� ����� �����ϸ�,
	�������̽� ��ü�� ��ӵȴ�.
	
��	�������̽��� ��� ������ �����ʹ�
	�������������ڸ� �������� �ʾƵ� �⺻ ���(primitive constant)��
	static final �� �����ڷ� �����ȴ�.

	Ŭ�������� �������̽��� �߰��Ͽ� ����� ���
	�������̽� �ȿ��� ���ǵ� ��� �޼ҵ带 ������ �־�� �ϸ�
	�������̽��� �����ϴ� Ŭ������
	�������̽��� ���� �������̽��� �����ϴ� �߻� �޼ҵ带 ������
	��� �޼ҵ带 �������� ���� ���
	�߻�(abstract) Ŭ������ �����ؾ� �Ѵ�.

��	����
	- �������̽��� �޼ҵ带 ���� �ϰ� ���Ǵ� ����.
	- �������̽��� implements �� ��� �ݵ�� ���� Ŭ������
	  �������̽��� ��� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�.
	- �������̽��� �ڵ������� ������ ���� ó���ȴ�.
	  ����� ���� : public static final
	  ���޼ҵ�	  : public abstract
	- ���� ����� �޸�(��,��)�� ���еǸ�
	  ���� ���� �������̽��� ����� �� �ִ�.
	- �������̽����� ��ӵ� ���� ��extends�� Ű���带 ����Ѵ�.

�� �������̽��� ����
   �������̽��� Ŭ������ ���� ������ ������ �������� ������ ������
   �޼ҵ带 ���� �ϰ� ���Ǵ� �� �� ����.
   ���� Ŭ���������� ������ ���� ���� �� ������
   �������̽������� ������ ���ó�� ���� �ٲ� �� ���� ������,
   ���� �ÿ� �̸� ���� �Ҵ��� ���ƾ� �Ѵ�.

�� �������̽��� ����
   �������̽��� Ŭ������ ���� ���ø��̱� ������
   ��� ������ �������̽��� ������ �־�� �ϴµ�
   �̷��� ����� �ϴ� ���� ��implements�� ������̴�.

 �� Ŭ������ ���ÿ� �� �� �̻��� �������̽���
 	implements �� �� �ִ�.

*/


// �������̽�

interface ADemo
{
	public void write();
}

// �������̽�
interface BDemo
{
	public void print();
}

// �� Ŭ������ ���� ����� �������� ������,
//	  �������̽��� ���� ����� �����Ѵ�.

// �������̽� - �� �������̽�(ADemo, BDemo)�� ��ӹ��� �������̽�
interface CDemo extends ADemo, BDemo,
{	
	/*
	public void write();
	pubiic void print();
	*/

	public void test();
}

// Ŭ����
//class DemoImpl
// �� �������̽�(ADemo, BDemo)�� ��ӹ��� �������̽�(CDemo)�� ������ �߻� Ŭ����
//abstract class DemoImpl implements CDemo
// �� �������̽�(ADemo, BDemo)�� ��ӹ��� �������̽�(CDemo)�� ������ ��
// ��� �޼ҵ带 �������� Ŭ����
class DemoImpl implements CDemo
{
	@Override
	public void test()
	{
		System.out.println("test()...");
	}

	@Override
	public void write()
	{
		System.out.println("write()...");
	}

	@Override
	public void print()
	{
		System.out.println("print()...");
	}

}

// Ŭ����
public class Test125
{
	public static void main(String[] args)
	{
		// �� �������̽��� ��ӹ��� �������̽��� �����ϰ�
		// ��� �޼ҵ带 �������� Ŭ������ ���� �ν��Ͻ� ����
		DemoImpl ob = new DemoImpl();

		ob.test();
		ob.write();
		ob.print();
	}
}
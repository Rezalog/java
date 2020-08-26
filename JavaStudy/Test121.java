/*=======================================
  ���� Ŭ���� ���� ����
  - ��� ���迡 �ִ� Ŭ������ ���� ĳ����
  - �� ĳ����, �ٿ� ĳ����
 =======================================*/

// super class, �θ� Ŭ����, ���� Ŭ����
class SuperTest121
{
	public int a=10, b=20;

	public void write()
	{
		System.out.println("���� Ŭ���� write() �޼ҵ� ...");
	}

	public int hap()
	{
		return a + b;
	}
}

// sub class, �ڽ� Ŭ����, ���� Ŭ����
class SubTest121 extends SuperTest121
{
	public int b=100, c=200;
	
	@Override
	public int hap()
	{
		return a + b + c;
	}
	public void print()
	{
		System.out.println("���� Ŭ���� print() �޼ҵ� ...");
	}

}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����(���� ��Ű��)
public class Test121
{
	public static void main(String[] args)
	{
		/*---------------------
		public int a=10, b=20;

		public void write()
		{
			System.out.println("���� Ŭ���� write() �޼ҵ� ...");
		}

		public int hap()
		{
			return a + b;
		}
		----------------------*/


		//sub class ��� �ν��Ͻ� ����
		SubTest121 ob1 = new SubTest121();		// �ڽ� Ŭ���� �ν��Ͻ� �����ϸ鼭 '�θ�ü��' �޸��ۿ÷�������
		System.out.println("ob1.b : " + ob1.b);
		//--==>> ob.b : 100
		

		// �� ��ĳ����
		//SuperTest121 ob2;
		SuperTest121 ob2 = ob1;		//	  ���⼭ �θ�ü�� ����������̾ƴ�!!
									//    ������� �θ�ü�� ���� �޸𸮿���
									//	  �ڽ��� -> �θ������� ����ȯ �Ѱ���

		//--��SuperTest121 ob2 = (SuperTest121)ob1;���� ������ ����

		/*
		�л� �ΰ� = new �л�();
		�ΰ� ��� = �ΰ�;			// ���ΰ� ��� = (�ΰ�)�ΰ�;���� ������ ����

		byte a = 10;
		short b = a;				// short b = (short)a;
		*/

		System.out.println("ob2.b : " + ob2.b);
		//--==>> ob2.b : 20
		//-- '������ ��ü���� ���� �Ҵ�'�ǹǷ�(�θ�, �ڽİ� ���������)
		//	 ���� b�� ob2(�θ�)�� �����̴�.
		
		System.out.println("��	: " + ob2.hap());
		//--==>> ��		: 310
		//-- hap() �޼ҵ�� �������̵�(Overriding)�Ǿ� �ְ�
		//	 ob2 �� ob1 �� ��ĳ������ ������ ��ü�̹Ƿ�
		//	 ��SuperTest121���� hap() �޼ҵ带 ȣ���ϴ� ���� �ƴ϶�
		//	 ��SubTest121������ �������� hap() �޼ҵ带 ȣ���ϰ� �ȴ�.
		//	 ������(�����)�� �̻�... ������ ������� �ǵ��� �� ����.

		// cf) ������ �޼ҵ� ��

		ob2.write();
		//--==>> ���� Ŭ���� write() �޼ҵ� ...

		//ob2.print();
		//--==>> �����߻�(�����Ͽ���)
		//	cannot find symbol       ob2.print();
		//	�θ�� �ڽİ��� ��������(������ �� ����)


		// �� �ٿ� ĳ����(��ĳ������ ���� ������ ...)
		((SubTest121)ob2).print();
		//--==>> ���� Ŭ���� print() �޼ҵ� ...

		
		// �� �߰� ����--------------------------------------------------
		//	  �ٿ� ĳ���� ���� ����

		SuperTest121 ob3 = new SuperTest121();		// �θ� Ŭ���� �ν��Ͻ� ����(�ء��ڽ� Ŭ���� �޸𸮴� �ö�������!!)
		SubTest121 ob4;

		//System.out.println(ob3.c);
		//--==>> ���� �߻�(������ ����)
		//	cannot find symbol         System.out.println(ob3.c);
		//-- ���������� ���� ��ü�� ���� ��ü�� ����� �����ϴ� ���� �Ұ����ϴ�.
		// �θ�� � �ڽ����ִ����� �𸥴�.

		//ob4 = ob3;
		//--==>> ���� �߻�(������ ����)
		//-- ���� ��ü�� ���� ��ü�� ����(������) �� ����.

		ob4 = (SubTest121)ob3;
		//--==>> ���� �߻�(��Ÿ�� ����)
		//java.lang.ClassCastException: SuperTest121 cannot be cast to SubTest121
		//-- �ۼ��� ������ �������� ������ �ٿ�ĳ������ �̷������ ��ó�� ���̳�
		//	 �������� ĳ������ �̷������ �ʴ´�.(�ڽ�Ŭ������ �޸� ����!!)

		//	 �� ������, ���� SubTest121 ��ü�� ���� �޸� �Ҵ��� �̷������ �ʾ�
		//	 �ٿ� ĳ������ �Ұ����ϱ� �����̴�.

	}
}

/*
�� �� ĳ����, �ٿ� ĳ������ ���������� �̷������ ���

	1. ���� ��ü ����;
	2. ���� = ����;			// �� ĳ����, ����
	3. ���� = ����;			// ���� �߻�
	4. ���� = (����)����;	// �ٿ� ĳ����, ����


�� �ٿ� ĳ������ ���������� �̷������ �ʴ� ���

	1. ���� ��ü ����;		
	2. ���� = ����;			// ���� �߻�
	3. ���� = (����)����;	// �ٿ� ĳ����, ��Ÿ�� ���� �߻�(������ �޸��Ҵ� �ȵ�)

�� �� ĳ������ �׻� ����, �ٿ� ĳ������ ��쿡 ����


*/
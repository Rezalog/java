/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- break
===============================================*/

// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1~100 ���� �ȿ�����
// �����ϵ��� ó���Ѵ�.

// ���� ��)
// ������ ���� �Է� : -10

// ������ ���� �Է� : 0

// ������ ���� �Է� : 2020

// ������ ���� �Է� : 10
// >> 1 ~ 10 ������ �� : 55
// ����Ͻðڽ��ϱ�(Y/N)? : y

// ������ ���� �Է� : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ͻðڽ��ϱ�(Y/N)? : N
// ����Ϸ��� �ƹ�Ű�� ��������...


// 1. ������ ���� �Է� �� 2���� ��� -> �� a�� 1~100 ������ ��� 1~a������ �� + ����Ͻðڽ��ϱ�(Y/N) ���� �ޱ� -> a. Y �ΰ�� -> �ٽ� ������ ���� �� �޵��� �ݺ�����
//																												-> b. N �ΰ�� -> ����(break)?
//									 -> �� a�� 1~100 ������ �ƴѰ�� -> �ٽ� ������ ���� �� �޵��� �ݺ�����
// �翡�� 1~a������ ��
// n<=a �������� n++���� Ŀ���� n�� ������(a+=n) + ����Ͻðڽ��ϱ�(Y/N)���� System.in.read�� ���� �ޱ�	-> a. Y �ΰ�� -> �ٽ� ������ ���� �� �޵��� �ݺ�����
//				
//-> b. N �ΰ�� -> ����(break)?


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test066
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader �ν��Ͻ� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s, i;
		//--n : �ܺηκ��� ������� �Է°��� ��Ƶ� ����
		//--s : ������ ���� ����� ��Ƶ� ����
		//--i : 1���� 1�� ������� �Է°����� ������ ����

		char ch;
		//--���μ����� ��� ���������� ���θ� ��Ƶ� ����
		//	(Y / y / N / n)
		
		while (true) //			...4
		{
			do		//-->> �ּ� �ѹ��� �Է��� �޾ƾ��ϰ�, �ݺ��ǹǷ� do-while�� ����. ...1
			{
				System.out.print("\n������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());		// \r\n �Ű������� �� ...10
			}
			while (n<1 || n>100);		

			s = 0;	//-->> �������� ��Ƴ� ���� �ʱ�ȭ �� ��ġ check ...2
					//-->> ����� ���ÿ� �ʱ�ȭ���Ѵٸ�, �ѹ��ݺ��ϰ� ���� ���� s���� �� �����ؼ� ���ϱ⶧���� ���� �ʱ�ȭ)	
	
			for (i=1; i<=n; i++)		//		...3
				s += i;
			System.out.printf(">> 1 ~ %d ������ �� : %d\n", n, s);
			
			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");		//		...5
			ch = (char)System.in.read();		//	...6

			// y + enter	��	readLine�� y�� �Է¹���.. �ٽ� �ö󰡼� ...9


			// ������ �ǻ�ǥ���� ���� ������ �ƴҶ� �������� �������� ó���ϴ� ��찡 ����.
			//ch=='N'	ch=='n'
			if (ch!='Y' && ch!='y')	// or�� ������ and, or�� n�� �־ ����		...7
			{
				// �ݺ���(while)�� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				//-- ���� ���� �ǻ�ǥ���� �ߴٸ�
				//	 �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.(���� for�� �� ������ ������ ����)
				break;
				//-- ���߰� ����������.
			}

			// ���Ͱ�(\r\n) ó��
			System.in.skip(2);		// ... 11


		}//while_end
		

		// ��Ÿ�ӿ���(numberFormat~) �� ...8

	}//main()_end

}//class()_end



/*(���� Ǯ��)

		int a;		//--����ڿ��� ���� ���� ��
		int	n=0;	//--����ڿ��� ���� ���� ���� ���� ��(���� ����)
		int sum=0;
		char q;

		// ����� �޼��� ��� �� ���� ���


		// ���� �� ó��

		while (true)
		{
			System.out.print("\n������ ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			


			if (a<=100 && a>=1)
			{

				while (n<=a)
				{
					sum += n;
					n++;
				}

				System.out.printf(">> 1 ~ %d ������ �� : %d\n", a, sum);

				System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");					
				q = (char)System.in.read();
				br.readLine();

				if(q=='Y')
				{

				}
				else if(q=='N' || q=='n')
				{
					break;
				}
			}		

		}
*/
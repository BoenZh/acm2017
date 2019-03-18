import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class balls {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //n������
        int m = sc.nextInt();    //�ִ��ϵ�����һ����ɫ����������ɫ����������������m���������������һ��
        int c = sc.nextInt();    //��ɫһ����c��
        int count = 0;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i < n;i++) {
            int num = sc.nextInt();
            for(int j=0;j < num;j++) {
                int key = sc.nextInt();
                if(!map.containsKey(key)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(key, list);
                }
                else {
                    List<Integer> list = map.get(key);
                    list.add(i);
                }
            }
        }
        for(int i=1;i <= c;i++) {
            boolean flag = false;
            List<Integer> list = map.get(i);
            if(list.size() == 1) {
                continue;
            }
            else {
                for(int j=0;j < list.size()-1;j++) {
                    if(list.get(j+1) - list.get(j) < m) {
                        count++;
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    if((n-list.get(list.size()-1)+list.get(0)) < m){
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);
    }

}
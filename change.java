


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class change {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        String s = strs[0];
        int m = Integer.parseInt(strs[1]);
 
        ArrayList<ArrayList<Integer>> positions = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            positions.add(new ArrayList<>());
        }
        for (int i = 0; i < s.length(); i++) {
            positions.get(s.charAt(i) - 'a').add(i);
        }
 
        int res = 0;
        //��������ĸ����������m�ν����������γ����ͬ���������Ӵ��ĳ���
        for (int i = 0; i < 26; i++) {
            res = Math.max(res, cal(positions.get(i), m));
        }
        System.out.println(res);
    }
 
    //��������m�ν������ַ�������ж��ٸ���������ĸ����
    private static int cal(ArrayList<Integer> p, int m) {
        //dp[i][j]: ��λ��p[i], ... , p[j]����ĸ�Ƶ�һ��ʹ֮��������Ҫ�������ƶ�����
        int[][] dp = new int[p.size()][p.size()];
        for (int i = 0; i < p.size() - 1; i++) {
            dp[i][i + 1] = p.get(i + 1) - p.get(i) - 1;
        }
 
        //������ĸ���ֶ���Ҳ�����ʱ�����������м��ƣ���֤�ƶ���������
        for (int len = 2; len < p.size(); len++) {
            for (int i = 0; i < p.size() - len; i++) {
                int j = i + len;
                dp[i][j] = dp[i + 1][j - 1] + (p.get(j) - p.get(i)) - (j - i);
            }
        }
 
        int res = 0;
        for (int i = 0; i < p.size(); i++) {
            for (int j = i; j < p.size(); j++) {
                if (dp[i][j] <= m) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }
}
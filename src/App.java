import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        int im = 0;
        int pa = 0;

        for(int i = 0; i <15; i++){
            int a = Integer.parseInt(br.readLine());
            if(a%2 == 0){
                par.add(a);
                pa++;
            }else if(a%2 != 0){
                impar.add(a);
                im++;
            }

            if(im  == 5){
                for(int k = 0; k < impar.size(); k++){
                    System.out.println("impar[" +k +"] = " +impar.get(k) );
                }
                impar.clear();
            }
            else if(pa == 5){

                for(int k = 0; k < par.size(); k++){
                    System.out.println("par[" +k +"] = " +par.get(k) );
                }
                par.clear();
            }

        }

        for(int i = 0; i < impar.size(); i++){
            System.out.println("impar[" +i +"] = " +impar.get(i) );
        }

        for(int i = 0; i < par.size(); i++){
            System.out.println("par[" +i +"] = " +par.get(i) );
        }
    }
}

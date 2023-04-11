package resources;

import java.util.Random;

public class GeraSenha {

    Random rand = new Random();
        public char valores(){
            String chars = "123456789";
            char c = chars.charAt(rand.nextInt(chars.length()));
            return c;
        }

        public char letras(){
            char c = (char)(rand.nextInt(26) + 'a');
            return c;

        }

        public char caracteres(){
            String chars = "!@#$%&*";
            char c = chars.charAt(rand.nextInt(chars.length()));
            return c;
        }

        public char embaralhador(){
            char embaralhado;
            int r=rand.nextInt(3);
            if(r== 0){
                embaralhado=valores();
            }else if(r==1){
                embaralhado=letras();
            }else{
                embaralhado=caracteres();
            }
            return embaralhado;
        }

        public String senha(int quantidade){
            String senhaMontada="";

            for (int i = 0; i < quantidade; i++) {
                senhaMontada += (embaralhador());
            }
            return senhaMontada;
        }
}

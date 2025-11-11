public class Operadores {
    
    //Operadores Aritméticos
    public float adicao(float v1, float v2){
        return v1+v2;
    }
    
    public float subtracao(float v1, float v2){
        return v1-v2;
    }
    public float multiplicacao(float v1, float v2){
        return v1*v2;
    }
    public float divisao(float v1, float v2){
        return v1/v2;
    }

    //Operadores de Atribuição
    public float atriSoma(float v1, float v2){
        return v1+=v2;
    }
        
    public float atriSub(float v1, float v2){
        return v1-=v2;
    }
    public float atriMult(float v1, float v2){
        return v1*=v2;
    }
    public float atriDiv(float v1, float v2){
        return v1/=v2;
    }

    //Operadores Lógicos
    public boolean e(float v1, float v2){
        return (v1>6) && (v2>6);
    }
    public boolean ou(float v1, float v2){
        return (v1>6) || (v2>6);
    }

    //Operadores de Comparação
    public boolean maior(float v1, float v2){
        return v1 > v2;
    }
    
    public boolean maiorIgual(float v1, float v2){
        return v1 >= v2;
    }
    
    public boolean menor(float v1, float v2){
        return v1 < v2;
    }
    
    public boolean menorIgual(float v1, float v2){
        return v1 <= v2;
    }
    
    public boolean igual(float v1, float v2){
        return v1 == v2;
    }
    
    public boolean diferente(float v1, float v2){
        return v1 != v2;
    }
    


}

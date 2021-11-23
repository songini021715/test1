package my.calculate;


public class Calculator {
    private int result=0;

    public int add(int operand1,int operand2){
        result=operand1+operand2;   //将两个传入参数进行相加操作
        return result;
    }

    public  int sub(int operand1,int operand2){
        result=operand1-operand2;   //将两个传入参数进行相减操作
        return  result;
    }

    public int multiply(int operand1,int operand2){
        result=operand1*operand2;   //将两个传入参数进行相乘操作
        return result;
    }

    public int divide(int operand1,int operand2){
        result=operand1/operand2;   //将两个传入参数进行相除操作
        return result;
    }

    public int getResult() {
        return this.result;
        //返回计算结果
    }
}


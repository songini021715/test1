import org.apache.commons.math3.util.MyMathArrays;

public class TestMyMathArrays {

    final double[] arr1 = {1, 2, 3}, arr2 = {10, 20, 30};

    public static void main(String[] args){
        TestMyMathArrays myTest = new TestMyMathArrays();
        myTest.testscale();
        myTest.testebeAdd();
        myTest.testdistance();
        myTest.testcheckEqualLength();
    }

    private void testscale() {
        double val = 10;
        MyMathArrays obj = new MyMathArrays();
        double[] tarr = obj.scale(val, arr1);
        if(MyMathArrays.equals(tarr, arr2)){
            System.out.println("Right");
        } else{
            System.out.println("Error");
        }
    }

    private void testebeAdd() {
        MyMathArrays obj = new MyMathArrays();
        final double[] arr = {11, 22, 33};
        double[] tarr = obj.ebeAdd(arr1, arr2);
        if(MyMathArrays.equals(tarr, arr)){
            System.out.println("Right");
        } else{
            System.out.println("Error");
        }
    }

    private void testdistance() {
        MyMathArrays obj = new MyMathArrays();
        double val = obj.distance(arr2, arr1);
        if(val == Math.sqrt(1134)) {
            System.out.println("Right");
        } else{
            System.out.println("Error");
        }
    }

    private void testcheckEqualLength() {
        MyMathArrays obj = new MyMathArrays();
        if(obj.checkEqualLength(arr1, arr2, true) == true) {
            System.out.println("Right");
        } else{
            System.out.println("Error");
        }
    }
}

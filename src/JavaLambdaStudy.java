public class JavaLambdaStudy {

    public static void main(String[] args) {
        // 引数を使って System.out.println を実行するオペレーションを、 Responder クラスに渡す。
        Responder<String> responder = new Responder<String>(x -> System.out.println(x));

        // execute で実行する。
        responder.execute("Responder called.");
    }

}

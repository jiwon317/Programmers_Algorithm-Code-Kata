class solution {

//    public int solution(int num1, int num2) {
//        int answer = 0;
//        return num1 * 1000 / num2;
//    }

    public int solution(int num1, int num2) {
        double answer = 0;

        answer = (double) num1 / num2 * 1000;

        return (int) answer;
    }
}


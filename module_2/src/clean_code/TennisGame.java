package clean_code;

public class TennisGame {

    public static String getScore(String player1, String player2, int score1, int score2) {
        String score = "";
        if (score1 == score2) {
            score = isSamePoint(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            score = over3Point(score1, score2);
        } else {
            score = under3Point(score1, score2);
        }
        return score;
    }

    //khi 2 người chơi bằng điểm
    public static String isSamePoint(int score1) {
        String score = "";
        switch (score1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    //khi 2 người có điểm số lớn hơn 3
    public static String over3Point(int score1, int score2) {
        String score = "";
        int minusResult = score1 - score2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    //khi 2 người chơi có số điểm dưới 3
    public static String under3Point(int score1, int score2) {
        int tempScore = 0;
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = score1;
            else {
                score += "-";
                tempScore = score2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String a = getScore("John", "Adam", 3, 1);
        System.out.println(a);
    }
}
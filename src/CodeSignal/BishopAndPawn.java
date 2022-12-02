package CodeSignal;

import java.util.*;

public class BishopAndPawn {

    public static void main(String[] args) {
        //System.out.println(solution("e4", "a1"));
        // System.out.println(solution("g1", "f3"));
        System.out.println(solution("d4", "f3"));
    }

    static boolean solution(String bishop, String pawn) {
        String[][] chess = new String[][]{
                {"a8", "b8", "c8", "d9", "e8", "f8", "g8", "h8"},
                {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
                {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
                {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
                {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
                {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
                {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
                {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"},
        };
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 8);
        map.put('b', 7);
        map.put('c', 6);
        map.put('d', 5);
        map.put('e', 4);
        map.put('f', 3);
        map.put('g', 2);
        map.put('h', 1);
        // All 4 direction
        char current = bishop.charAt(0);
        char currentPrev = (char) (bishop.charAt(0) - 1);
        int currentRow = Integer.parseInt(bishop.charAt(1) + "");

        Set<String> possibleMoves = new LinkedHashSet<>();

        // Left Top
        for (char c = current; c >= 'a'; c--) {
            if (currentRow >= 1 && currentRow <= 8 && c >= 'a' && c <= 'h') {
                possibleMoves.add(c + "" + currentRow++);
            }
        }

        // Right Bottom
        currentRow = Integer.parseInt(bishop.charAt(1) + "");
        for (char c = current; c <= 'h'; c++) {
            if (currentRow >= 1 && currentRow <= 8 && c >= 'a' && c <= 'h') {
                possibleMoves.add(c + "" + currentRow--);
            }
        }

        // Right Top
        currentRow = Integer.parseInt(bishop.charAt(1) + "");
        for (char c = current; c <= 'h'; c++) {
            if (currentRow >= 1 && currentRow <= 8 && c >= 'a' && c <= 'h') {
                possibleMoves.add(c + "" + currentRow++);
            }
        }

        // Left Bottom
        currentRow = Integer.parseInt(bishop.charAt(1) + "");
        for (char c = current; c >= 'a'; c--) {
            if (currentRow >= 1 && currentRow <= 8 && c >= 'a' && c <= 'h') {
                possibleMoves.add(c + "" + currentRow--);
            }
        }


        return possibleMoves.contains(pawn);

    }
}

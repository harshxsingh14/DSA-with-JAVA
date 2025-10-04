import java.util.*;

public class ladder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList); 
        if (!wordSet.contains(endWord)) return 0;

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        visited.add(beginWord);
        int length = 1;  

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                for (int j = 0; j < current.length(); j++) {
                    char[] chars = current.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (chars[j] == c) continue;  
                        chars[j] = c;
                        String newWord = new String(chars);

                        if (newWord.equals(endWord)) {
                            return length + 1;
                        }

                        if (wordSet.contains(newWord) && !visited.contains(newWord)) {
                            queue.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }

            length++;
        }

        return 0;  
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int result = ladderLength(beginWord, endWord, wordList);
        System.out.println("Shortest transformation length: " + result);
    }
}

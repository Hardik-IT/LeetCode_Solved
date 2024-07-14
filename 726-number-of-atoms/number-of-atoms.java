class Solution {
    public String countOfAtoms(String formula) {
        
        int n = formula.length();

        Stack<Map<String,Integer>> st = new Stack<>();
        st.push(new HashMap<>());
        int i = 0;
        while(i < n){
            if(formula.charAt(i) == '('){
                st.push(new HashMap<>());
                i++;
            }else if(formula.charAt(i) == ')'){
                Map<String, Integer> currMap = st.pop();
                i++;
                StringBuilder mult = new StringBuilder();
                while (i < n && Character.isDigit(formula.charAt(i))) {
                    mult.append(formula.charAt(i));
                    i++;
                }
                int multInteger = mult.length() > 0 ? Integer.parseInt(mult.toString()) : 1;
                for (String element : currMap.keySet()) {
                    currMap.put(element, currMap.get(element) * multInteger);
                }

                // Merging current map into the previous one
                Map<String, Integer> top = st.peek();
                for (String element : currMap.keySet()) {
                    top.put(element, top.getOrDefault(element, 0) + currMap.get(element));
                }
            }else{
                StringBuilder element = new StringBuilder();
                element.append(formula.charAt(i));
                i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) {
                    element.append(formula.charAt(i));
                    i++;
                }

                StringBuilder count = new StringBuilder();
                while (i < n && Character.isDigit(formula.charAt(i))) {
                    count.append(formula.charAt(i));
                    i++;
                }
                int num = count.length() > 0 ? Integer.parseInt(count.toString()) : 1;

                Map<String, Integer> top = st.peek();
                top.put(element.toString(), top.getOrDefault(element.toString(), 0) + num);

            }
        }

        Map<String, Integer> finalMap = st.pop();
        TreeMap<String, Integer> sortedMap = new TreeMap<>(finalMap);
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            result.append(entry.getKey());
            if (entry.getValue() > 1) {
                result.append(entry.getValue());
            }
        }

        return result.toString();
    }
}
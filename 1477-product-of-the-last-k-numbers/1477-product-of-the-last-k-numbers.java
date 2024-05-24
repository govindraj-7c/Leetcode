class ProductOfNumbers {
    ArrayList<Integer> list;
    int product;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        product = 1;
    }
    
    public void add(int num) {
        if(num == 0){
            list.clear();
            product = 1;
        }else{
            product *= num;
            list.add(product);
        }
    }
    
    public int getProduct(int k) {
        int idx = list.size() - k;
        if(idx>0) return product / list.get(idx-1);
        if(idx == 0) return product;

        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
class Main {
  public static void main(String[] args) throws Exception{
    String str = "Harsh Singh";
      HuffmanCoder hf = new HuffmanCoder(str);
    String a = hf.encode(str);
    System.out.println(a);
    String b = hf.decode(a);
    System.out.println(b);


  }
}
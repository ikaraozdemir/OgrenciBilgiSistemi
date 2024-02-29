public class Course {
   Teacher teacher;
   String name;
    int code;
   String prefix;
   int note;
   int sozluNote;
   double totNote = 0;


   Course (String name, String prefix,int code){
      this.code = code;
      this.name = name;
      this.prefix = prefix;

   }

   void addTeacher(Teacher tcr){
      if(this.prefix.equals(tcr.branch)){
         this.teacher = tcr;
      }else {
         System.out.println(tcr.name + " bu dersi veremez!");
      }
   }
   void printTeacher(){
      System.out.println(this.name + " dersinin Akademisyeni :" + teacher.name);
   }

}

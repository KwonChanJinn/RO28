package Entity;

public interface IStudent {
    //    //Tạo 1 interface IStudent bao gồm các method : điểmDanh(), họcBài(),
    //    //đi dọn vệ sinh()
    public void diemDanh();

    public void hocBai();

    public void didonvesinh();

    public void hienthithongtin();

    class Student implements IStudent {
        //Question 1: Interface Management
        //Tạo 1 class Student gồm các property id, name, group(int)
        //Tạo 1 interface IStudent bao gồm các method : điểmDanh(), họcBài(),
        //đi dọn vệ sinh()
        //Class Student sẽ implement interface như sau:
        //Method điểm danh() sẽ in ra nội dung như sau:
        //"Nguyễn Văn A điểm danh"
        //"Nguyễn Văn B điểm danh"
        //"Nguyễn Văn C điểm danh"
        //....
        //Method học Bài () sẽ in ra nội dung như sau:
        //"Nguyễn Văn A đang học bài"
        //"Nguyễn Văn B đang học bài "
        //"Nguyễn Văn C đang học bài "
        //...
        //Tương tự với các method còn lại
        private int id;
        private String name;
        private int group;

        public  static  int  COUNT = 0;

        public Student() {
        }

        public Student(String name, int group) {
            COUNT ++;
            this.id = COUNT;
            this.name = name;
            this.group = group;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGroup() {
            return group;
        }

        public void setGroup(int group) {
            this.group = group;
        }

        @Override
        public void diemDanh() {
            System.out.println(name + "Đang diểm danh");
        }

        @Override
        public void hocBai() {
            System.out.println(name + "Đi học bài ");

        }

        @Override
        public void didonvesinh() {

            System.out.println(name + "Đi dọn vệ sinh");

        }

        @Override
        public void hienthithongtin() {

        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", group=" + group +
                    '}';
        }
    }
}

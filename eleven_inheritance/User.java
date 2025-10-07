package eleven_inheritance;

public class User {
      public static void main(String[] args) {
        
        Learner learner = new Learner();
        System.out.println("==== Learner ====");
        learner.watchVideos();

        Videoadmin videoAdmin = new Videoadmin();
        System.out.println("==== Video Admin ====");
        videoAdmin.watchVideos();
        videoAdmin.addVideos();

         Superadmin superAdmin = new Superadmin();
        System.out.println("==== Super Admin ====");
        superAdmin.watchVideos();
        superAdmin.addVideos();
        superAdmin.deleteVideos();



         System.out.println("==== With Inheritance ====");
        
        System.out.println("==== Learner ====");
        learner.watchVideos();

        Videoadmininherit videoAdminInherit = new Videoadmininherit();
        System.out.println("==== Video Admin ====");
        videoAdminInherit.watchVideos();
        videoAdminInherit.addVideos();

        Superadmininherit superAdminInherit = new Superadmininherit();
        System.out.println("==== Super Admin ====");
        superAdminInherit.watchVideos();
        superAdminInherit.addVideos();
        superAdminInherit.deleteVideos();
    }

}

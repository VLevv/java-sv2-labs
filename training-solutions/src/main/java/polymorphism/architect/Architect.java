package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan plan = new SketchPlan(3,"title");
        Plan plan1 = new PermitPlan(3,"tile","Jani","Alma utca 3");
        Plan plan2 = new ConstructionPlan(3,"title","Jani","Alma utca 3",4);
        SketchPlan sketchPlan= new SketchPlan(3,"title");
        SketchPlan sketchPlan1= new PermitPlan(3,"title","Jani","Alma utca 3");
        SketchPlan sketchPlan2 = new ConstructionPlan(3,"title","Jani","Alma utca 3",4);
        Header header = new PermitPlan(3,"tile","Jani","Alma utca 3");
        Header header1= new ConstructionPlan(3,"title","Jani","Alma utca 3",4);
        PermitPlan permitPlan = new PermitPlan(3,"tile","Jani","Alma utca 3");
        PermitPlan permitPlan1= new ConstructionPlan(3,"title","Jani","Alma utca 3",4);
        ConstructionPlan constructionPlan = new ConstructionPlan(3,"title","Jani","Alma utca 3",4);

        System.out.println(plan.getPagesOfDocumentation());
        System.out.println(plan1.getPagesOfDocumentation());
        System.out.println(plan2.getPagesOfDocumentation());
        System.out.println(sketchPlan.getPagesOfDocumentation());
        System.out.println(sketchPlan.getTitle());
        System.out.println(sketchPlan1.getPagesOfDocumentation());
        System.out.println(sketchPlan1.getTitle());
        System.out.println(sketchPlan2.getPagesOfDocumentation());
        System.out.println(sketchPlan2.getTitle());
        System.out.println(header.getAddressOfBuilding());
        System.out.println(header.getNameOfClient());
        System.out.println(header1.getAddressOfBuilding());
        System.out.println(header1.getNameOfClient());
        System.out.println(permitPlan.getAddressOfBuilding());
        System.out.println(permitPlan.getHeader());
        System.out.println(permitPlan.getTitle());
        System.out.println(permitPlan.getNameOfClient());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println(permitPlan1.getAddressOfBuilding());
        System.out.println(permitPlan1.getHeader());
        System.out.println(permitPlan1.getTitle());
        System.out.println(permitPlan1.getNameOfClient());
        System.out.println(permitPlan1.getPagesOfDocumentation());
        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlan.getNameOfClient());
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getHeader());

    }
}

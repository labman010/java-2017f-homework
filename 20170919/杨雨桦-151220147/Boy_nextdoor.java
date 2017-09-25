public class Boy_nextdoor {
    public String color;
    public int rank;
    public Boy_nextdoor(String color,int rank)
    {
        this.color=color;
        this.rank=rank;
    }
    public void show_color()
    {
        switch(color)
        {
            case "red":
                System.out.print("红色");
                break;
            case "orange":
                System.out.print("橙色");
                break;
            case "yellow":
                System.out.print("黄色");
                break;
            case "green":
                System.out.print("绿色");
                break;
            case "cyan":
                System.out.print("青色");
                break;
            case "blue":
                System.out.print("蓝色");
                break;
            case "purple":
                System.out.print("紫色");
                break;
            default:
                System.out.print("error!");
                break;
        }
    }
    public void show_rank()
    {
        switch(rank)
        {
            case 0:
                System.out.print("老大");
                break;
            case 1:
                System.out.print("老二");
                break;
            case 2:
                System.out.print("老三");
                break;
            case 3:
                System.out.print("老四");
                break;
            case 4:
                System.out.print("老五");
                break;
            case 5:
                System.out.print("老六");
                break;
            case 6:
                System.out.print("老七");
                break;
            default:
                System.out.print("error!");
                break;
        }
    }
}

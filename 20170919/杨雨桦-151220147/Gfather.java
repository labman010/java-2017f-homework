import java.util.Random;

public class Gfather {
    Boy_nextdoor [] boys;
    public int count;
    Gfather(int number)
    {
        boys=new Boy_nextdoor[number];   //此处的空间没有用到？
        count=number;
    }
    public void createboys()
    {
        boys[0]=new Boy_nextdoor("red",0);
        boys[1]=new Boy_nextdoor("orange",1);
        boys[2]=new Boy_nextdoor("yellow",2);
        boys[3]=new Boy_nextdoor("green",3);
        boys[4]=new Boy_nextdoor("cyan",4);
        boys[5]=new Boy_nextdoor("blue",5);
        boys[6]=new Boy_nextdoor("purple",6);

    }
    public void NRandom()
    {
        Random random=new Random();
        for(int i=0;i<count;i++)
        {
            int p=random.nextInt(count);
            Boy_nextdoor tmp=boys[i];
            boys[i]=boys[p];
            boys[p]=tmp;
        }
        random=null;
    }
    public void bubblesort()
    {
        for(int i=0;i<count;i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (boys[j].rank > boys[j + 1].rank) {
                    Boy_nextdoor temp = boys[j];
                    boys[j] = boys[j+1];
                    boys[j+1] = temp;
                    say_change(j,j+1);
                    say_change(j+1,j);
                }

            }
        }

    }
    public void quicksort(int low ,int high)
    {
        if(low>=high)
            return;
        int first=low;
        int last=high;
        int key=boys[first].rank;
        Boy_nextdoor keycontent=boys[first];
        while(first<last)
        {
            while(first<last && boys[last].rank>=key)
            {
                last--;
            }
            boys[first]=boys[last];
            boys[last]=keycontent;
            if(first!=last) {
                say_change(last, first);
                say_change(first, last);
            }
            while(first<last && boys[first].rank<=key)
            {
                first++;
            }
            boys[last]=boys[first];
            boys[first]=keycontent;
            if(first!=last) {
                say_change(last,first);
                say_change(first, last);
            }
        }
        boys[first]=keycontent;
        quicksort(low,first-1);
        quicksort(first+1,high);
    }
    public void say_change(int before,int after)
    {
        boys[after].show_rank();
        System.out.print(": "+before+" -> "+after+"\n");
    }
    public void say_rank()
    {
        for(int i=0;i<count;i++) {
            boys[i].show_rank();
            System.out.print(" ");
        }
        System.out.print("\n");
    }
    public void say_color()
    {
        for(int i=0;i<count;i++) {
            boys[i].show_color();
            System.out.print(" ");
        }
        System.out.print("\n");
    }
}

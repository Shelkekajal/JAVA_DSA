// interface chessplayer{
//     //void moves();
// }
interface chessplayer{
}
class Queen implements chessplayer{
    public void moves(){System.out.println("moves U,D,R,L,D");}

}

class Rook implements chessplayer{
public void moves(){System.out.println("moves R,L");}

}
class King implements chessplayer{
    public void moves(){
        System.out.println("U,D,R,L");
    }
}

public class interfaces{
    public static void main(String args[]){
            Rook k=new Rook();
            k.moves();

    }
}
package algorithm;

import java.util.Scanner;

public class AlgorithmMain {
    public static void algoMain() {
        Scanner s2 = new Scanner(System.in);
        System.out.println("=========== (Algorithm) ==========");
        System.out.println(
                " 01.Largest common subsequence \n 02.Optimal Binary Search Tree \n 03.Matrix chain multiplication \n "
                        + "04.Strassen's matrix multiplication \n 05.BFS \n 06.DFS \n "
                        + "07.DAG \n 08.Longest increasing subsequence \n 09.Topological sort \n "
                        + "10.Krushkal's algorithm \n 11.Prim's algorithm \n 12.Dijkastra's algorithm \n "
                        + "13.Bellman ford's algorithm \n 14.Warshall's algorithm \n 15.(0,1) KKnapsack problem \n "
                        + "16.Naive string matching algorithm \n 17.Rabin krap string matching algorithm \n 18.Activity selection problem \n "
                        + "19.Recurrence \n 20.Max flow min cut");
        System.out.println("===================X===================");
        System.out.print("Enter your choice:> ");
        int c1 = s2.nextInt();

        switch (c1) {
            case 1:
                LCS lcs = new LCS();
                lcs.run();
                break;
            case 2:
                OBST obst = new OBST();
                obst.run();
                break;
            case 3:
                MatrixCM mCm = new MatrixCM();
                mCm.run();
                break;
            case 4:
                StrassenMatrixMult sMatrixMult = new StrassenMatrixMult();
                sMatrixMult.run();
                break;
            case 5:
                BFSGraph bfsGraph = new BFSGraph(4);
                bfsGraph.addEdge(0, 1);
                bfsGraph.addEdge(0, 2);
                bfsGraph.addEdge(1, 2);
                bfsGraph.addEdge(2, 0);
                bfsGraph.addEdge(2, 3);
                bfsGraph.addEdge(3, 3);

                System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

                bfsGraph.run(2);

                break;
            case 6:
                DFS dfs = new DFS();
                dfs.search(0);
                break;
            case 7:
                DAG dag = new DAG();
                dag.run();
                break;
            case 8:
                LIS lis = new LIS();
                lis.run();
                break;
            case 9:
                TopologicalSort topo = new TopologicalSort(6);
                topo.addEdge(5, 2);
                topo.addEdge(5, 0);
                topo.addEdge(4, 0);
                topo.addEdge(4, 1);
                topo.addEdge(2, 3);
                topo.addEdge(3, 1);
                topo.run();
                break;
            case 10:
                Krushkal krushkal = new Krushkal();
                krushkal.run();
                break;
            case 11:
                Prims prims = new Prims();
                prims.run();
                break;
            case 12:
                Dijkstra dijkstra = new Dijkstra(5);
                dijkstra.run();
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                KnapSack ks = new KnapSack();
                ks.runKnapSack();
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            default:
                break;
        }

    }

}

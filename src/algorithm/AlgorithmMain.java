package algorithm;

import java.util.Scanner;

import ds.Recurrencec;

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
                BellmanFord bellmanFord = new BellmanFord();
                bellmanFord.run();
                break;
            case 14:
                int INF = 99999;
                Warshall warshall = new Warshall();
                int graph[][] = { { 0, 5, INF, 10 },
                { INF, 0, 3, INF },
                { INF, INF, 0, 1 },
                { INF, INF, INF, 0 } };
                warshall.run(graph);
                break;
            case 15:
                KnapSack ks = new KnapSack();
                ks.runKnapSack();
                break;
            case 16:
                StringMatching sMatching = new StringMatching();
                String pat = "AABAACAADAABAAABAA";
                String txt = "AABA";
                sMatching.run(pat, txt);
                break;
            case 17:
                String text = "HELLO WORLD HELLO";
                String patt = "HELLO";
                int q = 101;
                RabinKarp rKarp = new RabinKarp();
                rKarp.run(text, patt, q);
                break;
            case 18:
                ActivitySelection activitySelection = new ActivitySelection();
                activitySelection.run();
                break;
            case 19:
                Recurrencec rec = new Recurrencec();
                rec.run();
                break;
            case 20:
                int graph1[][] = { { 0, 16, 13, 0, 0, 0 },
                        { 0, 0, 10, 12, 0, 0 },
                        { 0, 4, 0, 0, 14, 0 },
                        { 0, 0, 9, 0, 0, 20 },
                        { 0, 0, 0, 7, 0, 4 },
                        { 0, 0, 0, 0, 0, 0 }
                };
                MinCut minCut = new MinCut();
                minCut.run(graph1, 0, 5);
                break;
            default:
                break;
            }

    }

}

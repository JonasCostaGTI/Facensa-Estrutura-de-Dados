package OrdenacaoSimples_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sapateiro {

    private static class Job implements Comparable<Job> {

        private int id;
        private double ratio;

        private Job(int id, int noDaysOfDelay, int finePerDay) {
            this.id = id;
            ratio = (double) finePerDay / noDaysOfDelay;
        }

        public int getId() {
            return id;
        }

        @Override
        public int compareTo(Job o) {
            if (o == null) {
                return -1;
            }

            int r = Double.compare(o.ratio, ratio);
            if (r != 0) {
                return r;
            } else {
                if (id < o.id) {
                    return -1;
                } else if (id > o.id) {
                    return 1;
                }
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        Sapateiro.begin();
    }

    private static void begin() {
        Scanner sc = new Scanner(System.in);
        int noTestCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < noTestCases; i++) {
            sc.nextLine(); // process the blank line.

            int noJobs = Integer.parseInt(sc.nextLine());

            // Read in the jobs.
            List<Job> jobs = new ArrayList<Job>();
            for (int j = 0; j < noJobs; j++) {
                String line = sc.nextLine();
                StringTokenizer st = new StringTokenizer(line);
                int noDaysOfDelay = Integer.parseInt(st.nextToken());
                int finePerDay = Integer.parseInt(st.nextToken());
                jobs.add(new Job(j + 1, noDaysOfDelay, finePerDay));
            }

            // Minimize fine by sorting on finePerDay / noDaysOfDelay DESC.
            Collections.sort(jobs);

            // Print the result.
            StringBuilder sb = new StringBuilder();
            int index = 0;
            for (Job job : jobs) {
                index++;
                sb.append(job.getId());

                if (index < jobs.size()) {
                    sb.append(" ");
                }
            }

            System.out.println(sb);

            if (i < noTestCases - 1) {
                System.out.println();
            }
        }
    }
}

# 🏎️ Formula 1 Data Engineering & Analytics Project | Azure Databricks

This project showcases my end-to-end data engineering and analytics capabilities using **Azure Databricks**. Using real-world Formula 1 race data, I built a robust pipeline from raw ingestion to analytics and machine learning — demonstrating my ability to design scalable data solutions, implement best practices in the medallion architecture, and extract insights from complex datasets.

---

## 🧰 Tech Stack

- **Cloud Platform**: Azure Databricks (Spark-based runtime)
- **Languages**: Python (PySpark), SQL
- **Data Lake**: Azure Data Lake Storage Gen2 (Delta Lake format)
- **Ingestion**: Databricks Auto Loader
- **Transformation**: Medallion Architecture (Bronze → Silver → Gold)
- **Orchestration**: Databricks Workflows
- **Visualization**: Databricks SQL (BI-ready datasets)
- **ML (Optional)**: MLflow, AutoML

---

## 🎯 Project Objectives

✅ Build a production-style data lakehouse architecture  
✅ Automate ingestion and transformation using PySpark and Delta Lake  
✅ Deliver analytical datasets and dashboards for F1 race insights  
✅ (Bonus) Use ML to predict driver performance based on historical race data

---

## 🏗️ Architecture Overview

                ┌─────────────┐
                │   Raw Data  │   ← CSV/JSON from Ergast API
                └────┬────────┘
                     ▼
            ┌────────────────┐
            │   Bronze Layer │  ← Ingested via Auto Loader
            └────┬───────────┘
                 ▼
          ┌──────────────────┐
          │  Silver Layer    │  ← Cleaned & normalized with PySpark
          └────┬─────────────┘
               ▼
        ┌────────────────────┐
        │   Gold Layer       │  ← Aggregated race metrics & BI outputs
        └────────────────────┘


---

## 📊 Key Insights Produced

- 🔥 Fastest drivers per season & circuit
- 🛠️ Pit stop strategy analysis
- 🏁 Constructor performance over time
- 🌍 Driver nationality distribution
- 📈 Race results trends and championship points

---

## 📂 Project Structure

---

## 🔁 How to Use This Project

1. Import the notebooks into your Azure Databricks workspace.
2. Mount or upload raw data to `dbfs:/mnt/formula1/raw/`.
3. Run the notebooks in sequence in the ingestion folder:
   - <a href="https://github.com/loictiemani/Formula1_project/blob/main/ingestion/0.ingest_all_files.ipynb">0.ingest_all_files.ipynb</a>: Ingest all raw data files in one run
   - <a href="https://github.com/loictiemani/Formula1_project/blob/main/ingestion/1.ingest_circuits_file.ipynb"> 1.ingest_circuits_file.ipynb</a>: Ingest circuits file
   - <a href="https://github.com/loictiemani/Formula1_project/blob/main/ingestion/2.ingest_races_file.ipynb"> 2.ingest_races_file.ipynb </a>: Ingest races file
   - <a href="https://github.com/loictiemani/Formula1_project/blob/main/ingestion/3.ingest_constructors.json_file.ipynb">3.ingest_constructors.json_file.ipynb</a>: Ingest constructors JSON file
   - <a href="https://github.com/loictiemani/Formula1_project/blob/main/ingestion/4.ingest_drivers.json_file.ipynb">4.ingest_drivers.json_file.ipynb</a>: Ingest drivers JSON file
   - <a href="https://github.com/loictiemani/Formula1_project/blob/main/ingestion/5.ingest_results.json_file.ipynb">5.ingest_results.json_file.ipynb</a>: Ingest results JSON file
   - <a href="https://github.com/loictiemani/Formula1_project/blob/main/ingestion/6.ingest_pit_stops.json_file.ipynb">6.ingest_pit_stops.json_file.ipynb</a>: Ingest pit stops JSON file
   - <a href="https://github.com/loictiemani/Formula1_project/blob/main/ingestion/7.ingest_lap_times_file.ipynb">7.ingest_lap_times_file.ipynb</a>: Ingest lap times file
   - <a href="https://github.com/loictiemani/Formula1_project/blob/main/ingestion/8.ingest_qualifying.json_file.ipynb">8.ingest_qualifying.json_file.ipynb</a>: Ingest qualifying JSON file


4. Run the notebooks in sequence in the transformation folder
5. Use notebooks in the analysis folder `3.viz_find_dominant_drivers.ipynb` to visualize key KPIs.


---

## 🧠 Skills Demonstrated

- Designing & implementing a **medallion architecture**
- Building scalable pipelines with **PySpark & Delta Lake**
- Optimizing tables with **Z-Ordering & partitioning**
- Automating workflows with **Databricks Workflows**
- Performing **exploratory data analysis** & storytelling
- Developing a **job-ready portfolio project** in a real-world context

---

## 📈 Sample Visuals (Screenshots)

<!-- Add images here if applicable -->
- Driver standings trend by season  
- Pit stop durations by team  
- Constructors' championship history  
##### F1 Dominant Drivers
![F1 Dominant Drivers](https://raw.githubusercontent.com/loictiemani/Formula1_project/main/images/F1%20Dominant%20Drivers)


##### F1 Dominant Teams
![F1 Dominant Teams](https://raw.githubusercontent.com/loictiemani/Formula1_project/main/images/F1%20Dominant%20Teams)


---

## 📜 Data Source

- [Ergast Developer API](https://ergast.com/mrd/): Public F1 data API used to pull historical racing data.

Includes:
- Drivers
- Constructors
- Races
- Results
- Lap times
- Pit stops
---

## 📜 License

MIT License. See [LICENSE](./LICENSE) for details.

---

## 🙌 Acknowledgements

- Inspired by Ramesh Retnasamy's Azure Databricks & Spark For Data Engineers
- Databricks’ Formula 1 demo and the Ergast API.  
- Shoutout to the F1 data community!

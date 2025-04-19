# 🏎️ Formula 1 Data Analytics Project (Azure Databricks)

This project leverages Formula 1 race data to perform end-to-end data engineering and analytics workflows on **Azure Databricks**. The goal is to ingest, process, and analyze F1 data using PySpark, Delta Lake, and Databricks Notebooks, delivering insights into driver performance, team strategies, and race statistics.

---

## 📁 Project Structure


##### F1 Dominant Drivers
![F1 Dominant Drivers](https://raw.githubusercontent.com/loictiemani/Formula1_project/main/images/F1%20Dominant%20Drivers)


##### F1 Dominant Teams
![F1 Dominant Teams](https://raw.githubusercontent.com/loictiemani/Formula1_project/main/images/F1%20Dominant%20Teams)


---

## 💡 Key Features

- 📦 **Ingestion Layer (Raw to Bronze)**  
  Load raw CSV/JSON data into Delta format using Auto Loader and schema inference.

- ⚙️ **Transformation Layer (Bronze to Silver/Gold)**  
  Clean, transform, and optimize data using PySpark and Delta Lake.

- 📊 **Analytics**  
  Generate insights like:
  - Fastest lap analysis
  - Driver standings trends
  - Constructor performance by season



- 🧱 **Modular Notebook Design**  
  Each notebook performs a distinct task and can be used independently or via pipelines.

---

## 🔧 Tech Stack

- **Platform**: Azure Databricks
- **Languages**: Python (PySpark), SQL
- **Data Storage**: Azure Data Lake Storage Gen2 + Delta Lake
- **Visualization**: Databricks SQL / Power BI
- **Orchestration**: Databricks Workflows and Azure Data Factory

---

## 🚀 How to Run

1. Clone this repo into your Databricks workspace:
   - Use the Databricks Repo functionality or `dbutils.notebook.run()` for modular execution.

2. Upload data to `dbfs:/mnt/formula1/raw/`.

3. Execute notebooks in sequence:
   - `01_raw_to_bronze` → `02_bronze_to_silver` → `03_silver_to_gold`

4. Use `04_analytics_dashboard` for visualizations.

---

## 📂 Dataset Source

Data obtained from [Ergast Developer API](https://ergast.com/mrd/) and preprocessed into CSV files.  
Includes:
- Drivers
- Constructors
- Races
- Results
- Lap times
- Pit stops

---

## ✅ To-Do

- [x] Initial ingestion with Auto Loader
- [x] Bronze/Silver/Gold layer implementation
- [x] Delta Lake optimization
- [ ] ML-based driver performance prediction
- [ ] Integration with Power BI dashboard

---

## 🤝 Contributing

Feel free to fork this project or raise issues. PRs are welcome!  
Make sure to follow Databricks notebook version control best practices.

---

## 📜 License

MIT License. See [LICENSE](./LICENSE) for details.

---

## 🙌 Acknowledgements

Inspired by Ramesh Retnasamy's Azure Databricks & Spark For Data Engineers
Databricks’ Formula 1 demo and the Ergast API.  
Shoutout to the F1 data community!


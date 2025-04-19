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

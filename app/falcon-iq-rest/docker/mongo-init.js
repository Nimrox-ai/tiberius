// MongoDB initialization script for local development
db = db.getSiblingDB('falcon_iq');

// Create application user
db.createUser({
  user: 'falcon_user',
  pwd: 'falcon_password',
  roles: [
    {
      role: 'readWrite',
      db: 'falcon_iq'
    }
  ]
});

// Create collections and indexes
db.createCollection('okrs');
db.createCollection('okr_status');

// Create indexes for better performance
db.okrs.createIndex({ "owner": 1 });
db.okrs.createIndex({ "quarter": 1 });
db.okrs.createIndex({ "owner": 1, "quarter": 1 });

db.okr_status.createIndex({ "okr_id": 1 });
db.okr_status.createIndex({ "status": 1 });

print('MongoDB initialization completed for falcon_iq database');
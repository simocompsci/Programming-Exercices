<?php
// Database configuration
$host = 'localhost';
$dbname = 'your_database';
$username = 'your_username';
$password = 'your_password';

try {
    // Create PDO connection
    $db = new PDO("mysql:host=$host;dbname=$dbname", $username, $password);
    // Set error mode to exception
    $db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    
    


    $stmt = $db->prepare("SELECT * FROM users WHERE id = :id");
    $stmt->execute([':id' => $id]);






    
    $allowed = ['fizzy', 'snacks', 'dairy'];
    $cat = strtolower(trim($_GET['category'] ?? ''));
    if (!in_array($cat, $allowed)) {
        throw new Exception('Parametre invalide');
    }






    
    try {
        // Your database query here
    } catch (PDOException $e) {
        error_log($e->getMessage()); // logging
        echo "Erreur serveur. Contactez l'administrateur.";
    }

} catch(PDOException $e) {
    // Handle initial connection error
    error_log("Connection failed: " . $e->getMessage());
    echo "Erreur de connexion à la base de données.";
    exit;
}
?>

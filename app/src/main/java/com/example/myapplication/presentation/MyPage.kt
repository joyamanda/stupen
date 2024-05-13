package com.example.myapplication.presentation


import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.R
import com.example.myapplication.navigation.NavigationItem
import com.example.myapplication.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyPage(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { ScreenTitle(navController) },
                actions = {
                    IconButton(
                        onClick = { navController.navigateUp() }, // Navigate back when clicked
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }

            composable(Screen.Gallery.route) {
                GalleryScreen(navController)
            }

            composable(Screen.About.route) {
                AboutScreen()
            }

            composable(
                Screen.Detail.route + "/{mentorId}",
                arguments = listOf(navArgument("mentorId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailMentorScreen(
                    navController = navController,
                    mentorsId = navBackStackEntry.arguments?.getInt("mentorId")
                )
            }

            composable(
                Screen.Message.route + "/{pesanId}",
                arguments = listOf(navArgument("pesanId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                ConversationScreen(
                    navController = navController,
                    pesansId = navBackStackEntry.arguments?.getInt("pesanId")
                )
            }

            composable(
                Screen.DetailGallery.route + "/{galleryId}",
                arguments = listOf(navArgument("galleryId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailGallery(
                    navController = navController,
                    gallerysId = navBackStackEntry.arguments?.getInt("galleryId")
                )
            }
        }
    }
}
@Composable
private fun ScreenTitle(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val title = when (currentRoute) {
        Screen.Home.route -> stringResource(id = R.string.menu_home)
        Screen.Gallery.route -> stringResource(id = R.string.menu_gallery)
        Screen.About.route -> stringResource(id = R.string.menu_about)
        else -> stringResource(id = R.string.app_name) // Default title if route not found
    }

    Text(text = title)
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_gallery),
                icon = Icons.Default.Favorite,
                screen = Screen.Gallery
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_about),
                icon = Icons.Default.Face,
                screen = Screen.About
            )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun InfiniteAppPrev() {
    MyPage()
}
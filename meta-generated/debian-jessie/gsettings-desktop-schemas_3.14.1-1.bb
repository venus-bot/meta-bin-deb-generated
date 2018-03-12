PACKAGES = "${PN} gsettings-desktop-schemas"
PROVIDES = "gsettings-desktop-schemas"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gsettings-desktop-schemas/gsettings-desktop-schemas_3.14.1-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_gsettings-desktop-schemas = "gsettings-desktop-schemas_3.14.1-1_all.deb"
SRC_URI[deb0.sha256sum] = "723ba6cc41e3e655a129c4b877016d792de083a46534e24754b9baf6ae7f6964"
SRC_URI[deb0.md5sum] = "f0a0d3c54d5b6a53c5c167ccfd7e8eb1"

RDEPENDS_${PN} = "dconf-gsettings-backend"
DEPENDS = "dconf-gsettings-backend"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.privacy.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.screensaver.gschema.xml \
    ./usr/share/locale/ru/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/de/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/lt/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.lockdown.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.system.location.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.thumbnailers.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.a11y.keyboard.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.enums.xml \
    ./usr/share/locale/sk/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/da/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/doc/gsettings-desktop-schemas/README \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.media-handling.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.interface.gschema.xml \
    ./usr/share/locale/pt_BR/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.wm.preferences.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.datetime.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.thumbnail-cache.gschema.xml \
    ./usr/share/locale/pl/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/GConf/gsettings/wm-schemas.convert \
    ./usr/share/locale/el/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/sv/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/vi/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/tg/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/hu/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/doc/gsettings-desktop-schemas/copyright \
    ./usr/share/GConf/gsettings/gsettings-desktop-schemas.convert \
    ./usr/share/locale/zh_HK/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/fr/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/ja/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/10_gsettings-desktop-schemas.gschema.override \
    ./usr/share/doc/gsettings-desktop-schemas/changelog.gz \
    ./usr/share/locale/hi/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/sr/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.system.locale.gschema.xml \
    ./usr/share/locale/id/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/lv/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/it/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/es/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.search-providers.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.wm.keybindings.gschema.xml \
    ./usr/share/locale/eo/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.a11y.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.a11y.applications.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.default-applications.gschema.xml \
    ./usr/share/locale/nb/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.notifications.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.app-folders.gschema.xml \
    ./usr/share/locale/ca/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.session.gschema.xml \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.background.gschema.xml \
    ./usr/share/locale/gl/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/doc/gsettings-desktop-schemas/NEWS.gz \
    ./usr/share/locale/sl/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/sr@latin/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/as/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/doc/gsettings-desktop-schemas/changelog.Debian.gz \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.a11y.magnifier.gschema.xml \
    ./usr/share/doc/gsettings-desktop-schemas/AUTHORS \
    ./usr/share/locale/en_GB/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.sound.gschema.xml \
    ./usr/share/locale/cs/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.input-sources.gschema.xml \
    ./usr/share/locale/tr/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/pa/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/eu/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/bg/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.desktop.a11y.mouse.gschema.xml \
    ./usr/share/locale/ml/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/uk/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/pt/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/or/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/gu/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/ca@valencia/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/fi/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/ug/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/locale/he/LC_MESSAGES/gsettings-desktop-schemas.mo \
    ./usr/share/glib-2.0/schemas/org.gnome.system.proxy.gschema.xml\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

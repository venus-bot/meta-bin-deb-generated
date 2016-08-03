PACKAGES = "gsettings-desktop-schemas"
PROVIDES = "gsettings-desktop-schemas"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gsettings-desktop-schemas/gsettings-desktop-schemas_3.4.2-3_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_gsettings-desktop-schemas = "gsettings-desktop-schemas_3.4.2-3_all.deb"
SRC_URI[deb0.sha256sum] = "8f041dcf5f53b0b50380ea069bc3c6a8669724a25931ccc378eb67be24a8d0a7"
SRC_URI[deb0.md5sum] = "63d847911948a8384ddb0cf425b55e69"

RDEPENDS_${PN} = "dconf-gsettings-backend"
DEPENDS = "dconf-gsettings-backend"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/locale/ja/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.media-handling.gschema.xml \
	./usr/share/glib-2.0/schemas/10_gsettings-desktop-schemas.gschema.override \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.a11y.mouse.gschema.xml \
	./usr/share/locale/sl/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.a11y.applications.gschema.xml \
	./usr/share/locale/pt_BR/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.session.gschema.xml \
	./usr/share/glib-2.0/schemas/org.gnome.system.proxy.gschema.xml \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.lockdown.gschema.xml \
	./usr/share/doc/gsettings-desktop-schemas/changelog.Debian.gz \
	./usr/share/locale/es/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.default-applications.gschema.xml \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.enums.xml \
	./usr/share/locale/eo/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.a11y.keyboard.gschema.xml \
	./usr/share/locale/it/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.system.locale.gschema.xml \
	./usr/share/locale/gl/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/GConf/gsettings/gsettings-desktop-schemas.convert \
	./usr/share/locale/zh_CN/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.a11y.magnifier.gschema.xml \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.thumbnailers.gschema.xml \
	./usr/share/doc/gsettings-desktop-schemas/copyright \
	./usr/share/doc/gsettings-desktop-schemas/changelog.gz \
	./usr/share/doc/gsettings-desktop-schemas/NEWS.gz \
	./usr/share/doc/gsettings-desktop-schemas/AUTHORS \
	./usr/share/doc/gsettings-desktop-schemas/README \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.background.gschema.xml \
	./usr/share/locale/cs/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/locale/vi/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/GConf/gsettings/wm-schemas.convert \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.screensaver.gschema.xml \
	./usr/share/locale/sv/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.sound.gschema.xml \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.thumbnail-cache.gschema.xml \
	./usr/share/locale/de/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/locale/pl/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.wm.keybindings.gschema.xml \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.wm.preferences.gschema.xml \
	./usr/share/locale/nb/LC_MESSAGES/gsettings-desktop-schemas.mo \
	./usr/share/glib-2.0/schemas/org.gnome.desktop.interface.gschema.xml\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

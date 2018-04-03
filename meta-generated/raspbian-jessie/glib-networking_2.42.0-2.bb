PACKAGES = "${PN} glib-networking glib-networking-common glib-networking-services"
PROVIDES = "glib-networking glib-networking-common glib-networking-services"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/glib-networking/glib-networking_2.42.0-2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/glib-networking/glib-networking-common_2.42.0-2_all.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/glib-networking/glib-networking-services_2.42.0-2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_glib-networking = "glib-networking_2.42.0-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "70832a22b704ee9147208e65293b8a51f66f20ea71a241d0c8ac6b41f57d50b6"
SRC_URI[deb0.md5sum] = "d43c2bf9f6c2e4addd4ddd56d01b134a"
DEBFILENAME_glib-networking-common = "glib-networking-common_2.42.0-2_all.deb"
SRC_URI[deb1.sha256sum] = "f58923eeaea87db676343e7cb12e624b07df5f2fdfc0873051e4d1c1f309b4a4"
SRC_URI[deb1.md5sum] = "8a0701aa2bd74f14a6c9da34f3465c6b"
DEBFILENAME_glib-networking-services = "glib-networking-services_2.42.0-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "a8e425e8ca1923f776f9723c494dee47c98901e9a15750dc7b77e8651ebd5758"
SRC_URI[deb2.md5sum] = "31ef1c1a843fd4cd9ffb624945bb3e48"

RDEPENDS_${PN} = "libc6 (>= 2.4) libglib2.0-0 (>= 2.41.3) libgnutls-deb0-28 (>= 3.3.8) libp11-kit0 (>= 0.11) libproxy1 (>= 0.4.11) glib-networking-services (>= 2.42.0-2) glib-networking-services (<< 2.42.0-2.1~) glib-networking-common (= 2.42.0-2) gsettings-desktop-schemas"
RDEPENDS_${PN}-services = "libc6 (>= 2.4) libglib2.0-0 (>= 2.41.3) libproxy1 (>= 0.4.11) glib-networking-common (= 2.42.0-2)"
DEPENDS = "libp11-kit0 libglib2.0-0 libproxy1 gsettings-desktop-schemas libc6 libgnutls-deb0-28"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libgiognomeproxy.so \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libgiognutls.so \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libgiolibproxy.so \
    ./usr/share/doc/glib-networking/NEWS.gz \
    ./usr/share/doc/glib-networking/README \
    ./usr/share/doc/glib-networking/changelog.Debian.gz \
    ./usr/share/doc/glib-networking/copyright\
"
FILES_glib-networking-common = " \
    ./usr/share/doc/glib-networking-common/NEWS.gz \
    ./usr/share/doc/glib-networking-common/README \
    ./usr/share/doc/glib-networking-common/changelog.Debian.gz \
    ./usr/share/doc/glib-networking-common/copyright \
    ./usr/share/locale/an/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ar/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/as/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/be/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/bg/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/bn_IN/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ca/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ca@valencia/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/cs/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/da/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/de/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/el/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/en_CA/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/en_GB/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/eo/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/es/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/et/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/eu/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/fa/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/fi/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/fr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/fur/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/gl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/gu/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/he/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/hi/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/hu/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/id/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/it/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ja/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/km/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/kn/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ko/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/lt/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/lv/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ml/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/mr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/nb/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/nl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/or/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/pa/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/pl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/pt/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ro/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ru/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sk/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sr@latin/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sv/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ta/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/te/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/tg/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/th/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/tr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ug/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/uk/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/vi/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/zh_HK/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/glib-networking.mo\
"
FILES_glib-networking-services = " \
    ./usr/lib/glib-networking/glib-pacrunner \
    ./usr/share/dbus-1/services/org.gtk.GLib.PACRunner.service \
    ./usr/share/doc/glib-networking-services/NEWS.gz \
    ./usr/share/doc/glib-networking-services/README \
    ./usr/share/doc/glib-networking-services/changelog.Debian.gz \
    ./usr/share/doc/glib-networking-services/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

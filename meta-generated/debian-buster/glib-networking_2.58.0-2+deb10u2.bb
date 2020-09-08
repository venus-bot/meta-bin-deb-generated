PACKAGES = "${PN} glib-networking glib-networking-common glib-networking-services"
PROVIDES = "glib-networking glib-networking-common glib-networking-services"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/glib-networking/glib-networking_2.58.0-2+deb10u2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/glib-networking/glib-networking-common_2.58.0-2+deb10u2_all.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/g/glib-networking/glib-networking-services_2.58.0-2+deb10u2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_glib-networking = "glib-networking_2.58.0-2+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "be52a8a9eaa067d6e2f1fe1d06b2f6e614c461df3d39f77e15225c8af860d265"
SRC_URI[deb0.md5sum] = "3fe590bb1e54281a3115818473760ed2"
DEBFILENAME_glib-networking-common = "glib-networking-common_2.58.0-2+deb10u2_all.deb"
SRC_URI[deb1.sha256sum] = "ef84896340440b25871c1e3f1d102837290db24382ad40ac74c769a70b1203be"
SRC_URI[deb1.md5sum] = "f8e33c4a45f2a70e6b62f9b44b91075f"
DEBFILENAME_glib-networking-services = "glib-networking-services_2.58.0-2+deb10u2_armhf.deb"
SRC_URI[deb2.sha256sum] = "2c2e2f44b89c3e424bb84666e47c67c4b81a731a37cf776fc6bda58189b8e2b6"
SRC_URI[deb2.md5sum] = "d0edfbd32b99d599660b3e22aa2d8203"

RDEPENDS_${PN} = "glib-networking-common (>= 2.58.0-2+deb10u2) glib-networking-services (<< 2.58.0-2+deb10u2.1~) glib-networking-services (>= 2.58.0-2+deb10u2) gsettings-desktop-schemas libc6 (>= 2.4) libglib2.0-0 (>= 2.55.0) libgnutls30 (>= 3.6.6) libproxy1v5 (>= 0.4.14)"
RDEPENDS_${PN}-common = ""
RDEPENDS_${PN}-services = "glib-networking-common (>= 2.58.0-2+deb10u2) libc6 (>= 2.4) libglib2.0-0 (>= 2.55.0) libproxy1v5 (>= 0.4.14)"
DEPENDS = "gsettings-desktop-schemas libc6 libglib2.0-0 libgnutls30 libproxy1v5"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libgiognomeproxy.so \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libgiognutls.so \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libgiolibproxy.so \
    ./usr/share/doc/glib-networking/NEWS.gz \
    ./usr/share/doc/glib-networking/changelog.Debian.gz \
    ./usr/share/doc/glib-networking/copyright\
"
FILES_glib-networking-common = " \
    ./usr/share/doc/glib-networking-common/changelog.Debian.gz \
    ./usr/share/doc/glib-networking-common/copyright \
    ./usr/share/locale/an/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ar/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/as/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/be/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/bg/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/bn_IN/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/bs/LC_MESSAGES/glib-networking.mo \
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
    ./usr/share/locale/gd/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/gl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/gu/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/he/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/hi/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/hr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/hu/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/id/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/it/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ja/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/kk/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/km/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/kn/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ko/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/lt/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/lv/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ml/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/mr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/nb/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ne/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/nl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/oc/LC_MESSAGES/glib-networking.mo \
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
    ./usr/lib/systemd/user/glib-pacrunner.service \
    ./usr/share/dbus-1/services/org.gtk.GLib.PACRunner.service \
    ./usr/share/doc/glib-networking-services/changelog.Debian.gz \
    ./usr/share/doc/glib-networking-services/copyright\
"

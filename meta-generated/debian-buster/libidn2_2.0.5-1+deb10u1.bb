PACKAGES = "${PN} libidn2-0"
PROVIDES = "libidn2-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libi/libidn2/libidn2-0_2.0.5-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libidn2-0 = "libidn2-0_2.0.5-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "54d1236b69ddcf2918b921b1f41d973adb40dd18419208ad84d04bbdfb3f45b4"
SRC_URI[deb0.md5sum] = "851363960ab3c9bef8d4852c8a6d18d4"

RDEPENDS_${PN}-0 = "libc6 (>= 2.4) libunistring2 (>= 0.9.7)"
DEPENDS = "libc6 libunistring2"


inherit deb_group

FILES_libidn2-0 = " \
    ./usr/lib/arm-linux-gnueabihf/libidn2.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libidn2.so.0.3.4 \
    ./usr/share/doc/libidn2-0/AUTHORS \
    ./usr/share/doc/libidn2-0/NEWS.gz \
    ./usr/share/doc/libidn2-0/README.md.gz \
    ./usr/share/doc/libidn2-0/changelog.Debian.gz \
    ./usr/share/doc/libidn2-0/changelog.gz \
    ./usr/share/doc/libidn2-0/copyright \
    ./usr/share/lintian/overrides/libidn2-0 \
    ./usr/share/locale/cs/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/da/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/de/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/eo/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/es/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/fi/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/fr/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/fur/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/hr/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/hu/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/id/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/it/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/ja/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/nl/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/pl/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/ro/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/sr/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/sv/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/uk/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/vi/LC_MESSAGES/libidn2.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/libidn2.mo\
"

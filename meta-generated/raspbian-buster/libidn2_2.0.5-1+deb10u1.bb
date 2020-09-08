PACKAGES = "${PN} libidn2-0"
PROVIDES = "libidn2-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libi/libidn2/libidn2-0_2.0.5-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libidn2-0 = "libidn2-0_2.0.5-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "48ca6a20d9901a78b714dc926b74371786b03ece5956ab4f78a148a74f4ad56f"
SRC_URI[deb0.md5sum] = "6cd253f433228ed571e0a8e11dcbde62"

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

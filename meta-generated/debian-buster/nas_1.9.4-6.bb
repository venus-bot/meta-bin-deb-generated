PACKAGES = "${PN} libaudio2"
PROVIDES = "libaudio2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/nas/libaudio2_1.9.4-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libaudio2 = "libaudio2_1.9.4-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "30caeb7abba11d8cd23d07a6ebf1648595e95b8a6917d8bf4ff42604e41b054d"
SRC_URI[deb0.md5sum] = "f7a3e2ef2828ab53b7b1265329010563"

RDEPENDS_libaudio2 = "libc6 (>= 2.15) libxau6 libxt6"
DEPENDS = "libc6 libxau6 libxt6"


inherit deb_group

FILES_libaudio2 = " \
    ./usr/lib/arm-linux-gnueabihf/libaudio.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libaudio.so.2.4 \
    ./usr/share/doc/libaudio2/FAQ \
    ./usr/share/doc/libaudio2/README.gz \
    ./usr/share/doc/libaudio2/TODO \
    ./usr/share/doc/libaudio2/changelog.Debian.gz \
    ./usr/share/doc/libaudio2/changelog.gz \
    ./usr/share/doc/libaudio2/copyright \
    ./usr/share/libaudio2/AuErrorDB\
"

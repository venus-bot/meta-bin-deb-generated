PACKAGES = "${PN} libaudio2"
PROVIDES = "libaudio2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/nas/libaudio2_1.9.4-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libaudio2 = "libaudio2_1.9.4-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "657762111b70595a3993738d1fb406cfc5272f369e2802e78d0bce4bcf621ee0"
SRC_URI[deb0.md5sum] = "a82b505769cf64f6215163c654982be2"

RDEPENDS_libaudio2 = "libc6 (>= 2.15) libxau6 libxt6 multiarch-support"
DEPENDS = "libc6 libxau6 libxt6 multiarch-support"


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

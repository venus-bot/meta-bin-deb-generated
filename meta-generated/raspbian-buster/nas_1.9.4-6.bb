PACKAGES = "${PN} libaudio2"
PROVIDES = "libaudio2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/nas/libaudio2_1.9.4-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libaudio2 = "libaudio2_1.9.4-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "2f47122397a1e4079bbc722529d38f98738a85194e305bc76c5d02012c28f610"
SRC_URI[deb0.md5sum] = "69224cdd69bd1e973638497f2f0b2210"

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
